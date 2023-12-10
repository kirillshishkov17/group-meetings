-- Создание базы данных group_meeting
CREATE DATABASE group_meeting;

-- Создание таблицы users
CREATE TABLE IF NOT EXISTS persons (
    id SERIAL PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL
    );

-- Вставка тестовых данных, если таблица пуста
INSERT INTO persons (login, password, name) VALUES
    ('bigboss', 'pass', 'Kirill'),
    ('polarized_d', '123', 'Alexey'),
    ('sobaka', '123', 'Misha')
