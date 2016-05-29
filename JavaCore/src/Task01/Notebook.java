package Task01;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Notebook {
	
	
	//создать блокнот и запись в нем
	public static void createWrite(String addWrite, String fileName) throws IOException{
		//определяем файл
		File file = new File(fileName);
		
		//проверяем, если не существует, то создаем
		if(!file.exists()){
			file.createNewFile();
		}
		//PrintWriter для записи в файл
		PrintWriter out = new PrintWriter(file.getAbsoluteFile());
			
		//записываем текст в файл
		out.print(addWrite);
		//закрываем файл, иначе не запишется
		out.close();
			
	}
	
	
	public static void clicked(String nameFile) throws IOException{                                    
		//текстовый файл, следует открывать в текстовом редакторе по умолчанию
        File file = new File(nameFile);
         
        //первая проверка, если Desktop поддерживается платформой или нет
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
         
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) {
			desktop.open(file);
		}
         
//        //PDF file
//        file = new File("java.pdf");
//        if(file.exists()) desktop.open(file);
        
    }

	
	//добавить запись
	public static void addWrite(String nameFile, String newWrite) throws IOException{
		StringBuilder sb = new StringBuilder();
		String oldFile = lookAllWriters(nameFile);
		sb.append(oldFile);
		sb.append(newWrite);
		createWrite(sb.toString(), nameFile);
	}
	
	//корректировать запись запись
	public static void delWrite(String nameFile,int dlinaOt, int dlinaDo) throws IOException{
		StringBuilder sb = new StringBuilder();
		String oldFile = lookAllWriters(nameFile);
		oldFile = oldFile.substring(dlinaOt, dlinaDo);
		sb.append(oldFile);
		createWrite(sb.toString(), nameFile);
	}
	
	//заменить на другую запись
	public static void editWrite(String nameFile, String newWrite) throws IOException{
		StringBuilder sb = new StringBuilder();
		sb.append(newWrite);
		createWrite(sb.toString(), nameFile);
	}
	
	
	//посмотреть все записи
	public static String lookAllWriters(String fileName) throws FileNotFoundException {
		//Объект для построение строки
		StringBuilder sb = new StringBuilder();
		exists(fileName);
		
		try{
			//Объект для чтения файла в буфере
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			
			try{
				//В цикле построчно считываем файл
				String readString;
				while((readString = in.readLine()) != null){
					sb.append(readString);
					sb.append("\n");
				}
			}finally{
				//закрываем файл
				in.close();
			}
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		//возвращает полученный текст с файла
		return sb.toString();
	}
	private static void exists(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		
		if(!file.exists()){
			throw new FileNotFoundException(file.getName());
		}
	}
	
	//удаление файла
	public static void DelNotebook(String nameFile) throws FileNotFoundException{
		exists(nameFile);
		new File(nameFile).delete();
	}
	
	
}
