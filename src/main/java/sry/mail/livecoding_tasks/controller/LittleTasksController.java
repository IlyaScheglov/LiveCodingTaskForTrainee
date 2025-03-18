package sry.mail.livecoding_tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/little-tasks")
public class LittleTasksController {

    @GetMapping("/is-palindrome")
    public ResponseEntity<Boolean> isPalindrome(@RequestParam("first") Integer first,
                                              @RequestParam("second") Integer second) {
//        Задача 1: Палиндром числа
//
//        Напишите функцию на Java, которая проверяет, является ли заданное целое число палиндромом.
//                Палиндром - это число, которое читается одинаково в обоих направлениях (например, 121, 12321).
        return null;
    }

    @GetMapping("/is-anagram")
    public ResponseEntity<Boolean> isAnagram(@RequestParam("first") String first,
                                              @RequestParam("second") String second) {
//        Задача 2: Анаграммы строк
//
//        Напишите функцию на Java, которая проверяет, являются ли две заданные строки анаграммами друг друга.
//                Анаграмма - это слово или фраза, образованная путем перестановки букв другого слова или фразы
//                (например, "listen" и "silent"). Регистр букв не должен учитываться, а пробелы нужно игнорировать.
        return null;
    }
}
