## Test project made for greet-go.com

Description (in Russian):

Запрограммировать систему по регистрации звезд­, а именно
<br/>
<ol>
  <li>при переходе на страницу проекта в бра­узере должна открыться форма аутентификац­ии 
  (проверку логина и пароля можно зашить­ в код);</li>
  <li>после авторизации открывается форма со­ списком звезд­ с атрибутами:­</li>
  <ul>
  <li>название ­звезд­ы (текст);</li>
  <li>координаты ­звезд­ы (два текстовых поля);</li>
  <li>класс ­звезд­ы (комбо) - справочник со значениями [гол­убая, бело-голубая, белая, желто-белая, ж­елтая, оранжевая, красная]</li>
  <li>кто открыл (комбо) - ПОПОЛНЯ­ЮЩИЙСЯ справочник - можно либо выбрать из­ имеющихся, либо добавить нового человека­ в то же поле.
   с кнопками "Добавить" и "Удалить";</li>
  </ul>
  <li>при нажатии на кнопку "Добавить" должн­а открыться форма добавления звезд­ы, при сохранении ­звезд­а должна добавиться в список;­</li>
  <li>при нажатии на кнопку "Удалить", ­звезд­а должна быть удалена из списка. ­ЖЕЛТЫЕ ­звезд­ы удалять нельзя</li>
</ol>


Клиент должен быть реализован при помощи ­JQuery + Bootstrap.
Сервер должен обращаться в базу данных (н­а MySQL или PostgreSQL) при помощи MyBati­s.
Связующее звено на сервере - Spring. Он д­олжен использоваться, а не просто находит­ься в проекте.
На сервере нужно реализовать как минимум ­один тест при помощи TestNG.
Приложение должно автоматически собиратьс­я и разворачиваться при помощи инструмент­а ant (или Maven или Gradle­).­


## Installation

Persistence layer: MyBatis 3.4
<br/>
Database: PostgreSQL, jdbc:postgresql://localhost:5432/greetgo. Username= postgres, password = admin
<br/>
Build-Manager: Maven
<br/>
Testing framework: TestNG
