package Task01;

import java.io.IOException;

public class WriteInNotebook {
	
	private static String addWrite = 
			"hello world!";
	private static String fileName = 
			"C://Users/Слафка/Desktop/EPAM - HW/Домашние задания/notebook.txt";
	
	public static void main(String[] args) throws IOException {
		
		Notebook notebook = new Notebook();

		//создать и добавить запись
//		notebook.createWrite(addWrite, fileName);
		
		
		
		//1 способ, редатирования файла txt
		//добавление записей
//		notebook.addWrite(fileName, "how are you? ");
		
		//корректирование записи
//		notebook.delWrite(fileName, 12, 25);
		
		//заменить
//		notebook.editWrite(fileName, "привет мир!");
		
		
		
		//2 способ, редатирование в самом txt
//		notebook.clicked(fileName);
		
		
		
		//посмотреть все записи
		String look = notebook.lookAllWriters(fileName);
		System.out.println(look);
		
		
		
		//удаление файла
//		notebook.DelNotebook(fileName);;
		
		
		
		
		
	}
}
