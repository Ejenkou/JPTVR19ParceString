/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19parcestring;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private Object chStr;

   public void run() {
       System.out.println("Проэкт работы со строкой");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите строку");
       String str = scanner.nextLine();
       System.out.println("Программа может выполнить следующие задачи:");
       System.out.println("1. Ввести количество символов в строке");
       System.out.println("2. удалить указанную подстроку");
       System.out.println("3. заменить указанную подстроку на другую");
       System.out.println("4. удалить все html из строки");
       System.out.println("5.удалить указанный тэг из строки");
       System.out.println("Выберите следующие действие");
       String task = scanner.nextLine();
        switch (task) {
           case "1":
               System.out.println("1. Ввести количество символов в строке");
               System.out.println("В строке"+str.length()+"символов");
               System.out.println("букв:"+ this.getCountLetters(str));
               break;
           case "2":
               System.out.println("2. удалить указанную подстроку");
               break;
           case "3":
               System.out.println("3. заменить указанную подстроку на другую");
               break;
           case "4":
               System.out.println("4. удалить все html из строки");
               break;
           case "5":
               System.out.println("5.удалить указанный тэг из строки");
              break;
           default:
               System.out.println("Нет такой задачи!");
    
      
                
        }
   }

    private int getCountLetters(String str) {
      char[] chStr = str.toCharArray();
      int n = 0;
      for (int i = 0; i < chStr.length; i++) {
          if(chStr[i] != ' ' && chStr [i] != ','
            && chStr [i]  != '.'&& chStr [i]  != ':'
            && chStr [i]  != ';'){
            n++;
          }
      }   
      return n;
    }
}

    
  
   
    
    
    

    
