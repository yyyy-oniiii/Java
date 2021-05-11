/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 조건 연산자(삼항 연산자)

 package section_03.operator;

 public class operator1_9 {
     public static void main(String[] args) {
         int fatherAge = 55;
         int motherAge = 50;
 
         char ch;
         ch = (fatherAge > motherAge) ? 'T' : 'F';
         System.out.println(ch);
     }
 }
 