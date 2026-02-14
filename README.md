# Document Factory Method (Java)

Бұл жоба Java тілінде жазылған және
«Шаблоны проектирования приложений» пәні бойынша
практикалық жұмыс ретінде орындалды.

Жобада Factory Method жобалау паттерні қолданылған.

---

## Жобаның мақсаты

- Factory Method паттернін практикада қолдану
- Әртүрлі құжаттарды бір жүйе арқылы құру
- Жүйені жаңа құжат түрлерімен оңай кеңейту

---

## Қолданылған паттерн

**Factory Method**

Бұл паттерн объектіні тікелей `new` арқылы емес,
арнайы фабрика арқылы жасауға мүмкіндік береді.

Нәтижесінде:
- Код икемді болады
- Жаңа класс қосу жеңілдейді
- Негізгі логика өзгермейді

---

## Қолдау табатын құжаттар

- Report (Отчет)
- Resume (Резюме)
- Letter (Письмо)
- Invoice (Счет-фактура)

Барлық құжаттар `Document` интерфейсін іске асырады.

---

## Жоба құрылымы

```text
DocumentFactoryApp/
│
├── documents/
│   ├── Document.java
│   ├── Report.java
│   ├── Resume.java
│   ├── Letter.java
│   └── Invoice.java
│
├── creators/
│   ├── DocumentCreator.java
│   ├── ReportCreator.java
│   ├── ResumeCreator.java
│   ├── LetterCreator.java
│   └── InvoiceCreator.java
│
└── Main.java
