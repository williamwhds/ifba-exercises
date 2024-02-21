/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  williamwhds
 * Created: Nov 24, 2023
 */

CREATE DATABASE IF NOT EXISTS inovar;

USE inovar;

CREATE TABLE IF NOT EXISTS CURSO (
    id int PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS USUARIO (
    id int PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL
);
