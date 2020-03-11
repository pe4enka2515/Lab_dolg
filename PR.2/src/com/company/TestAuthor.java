package com.company;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Уильям Шекспир", " ", 'М');
        author.setEmail("Shakespeare@mail.com");
        System.out.println("Имя: " + author.getName() + ", Email: " + author.getEmail() + ", Пол: " + author.getGender());
    }
}
