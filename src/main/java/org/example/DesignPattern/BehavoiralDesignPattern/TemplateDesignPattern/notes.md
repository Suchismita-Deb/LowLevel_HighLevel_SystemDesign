### when to use the Template Design Pattern?

When we want all the classes to follow the specific steps to process the task but also needs to provide the flexibility that each class can have their own logic in that specific steps.

Example - Payment example.
PaymentToFriend and another is PaymentToMerchant.

We want for both of the cases all the flow to follow same steps and there can be some changes.

Steps like `Validate Request`, `Debit Money`, `CalculatePlatformFees`, `CreditMoney`. Now for PaymentToFriend and PaymentToMerchant they will follow the same step and they will modify it. The PaymentToFriend has no platformFees and PaymentToMerchant has some platform fees. The PaymentToFriend follows the debit first then the credit and PaymentToMerchand follows credit first then debit. They follows all the steps with some modification.

We will create one template method. Abstract class we can create one abstract method and show one implement od the method.



The ordering of the task is created. Now when will call the sendMoney then it will see the method and the method will be called from the override.


The method is called the template method. It only provide the template of the methods.



Example.

There is an application with different data parsers like CSV, XML, JSON. Each parser has the same step like open, parse the file and close the file. The parse is specific to parser and the open close same and it act as a template.

In case of not using the template pattern there will be code duplication.

```java
package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.ProblematicCode;

public class NoTemplatePattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JsonParser jsonParser = new JsonParser();
        csvParser.parse();
    }

}

class CSVParser {
    public void parse() {
        openFile();
        // ParseLogic
        closeFile();
    }

    public void openFile() {
        System.out.println("Opening file...");
    }

    public void closeFile() {
        System.out.println("Closing file...");
    }
}

class JsonParser {
}
```

The fix to use the Abstract class including the template(), open(), close() and parse().

The CSVParser will override the parse method. The template method will implement the open, close and parse and the parse will be separate for the class.