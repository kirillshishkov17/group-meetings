-- Создание базы данных group_meeting
CREATE DATABASE group_meeting;

-- Создание таблицы person
CREATE TABLE IF NOT EXISTS person (
    id SERIAL PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL
    );

-- Вставка тестовых данных, если таблица пуста
INSERT INTO person (login, password, name) VALUES
    ('bigboss', 'pass', 'Kirill'),
    ('polarized_d', '123', 'Alexey'),
    ('sobaka', '123', 'Misha');

-- Создание таблицы meeting_group
CREATE TABLE IF NOT EXISTS meeting_group (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    owner_id INT NOT NULL
    );

-- Вставка тестовых данных, если таблица пуста
INSERT INTO meeting_group (title, owner_id) VALUES
    ('first_group', 1);

-- Создание таблицы persons_to_group
CREATE TABLE IF NOT EXISTS persons_to_group (
    person_id INT NOT NULL,
    group_id INT NOT NULL,
    FOREIGN KEY (person_id) REFERENCES person(id),
    FOREIGN KEY (group_id) REFERENCES meeting_group(id)
);

-- Вставка тестовых данных, если таблица пуста
INSERT INTO persons_to_group VALUES
    (1, 1);