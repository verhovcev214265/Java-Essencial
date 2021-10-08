package ua.com.itvdn.javaessencial.lecture2.hometask.task4;

public class ProDocumentWorcker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("The document was edited ");

    }

    @Override
    void saveDocument() {
        System.out.println("The document was saved in the old format.\n" +
                "If you want to save documents in others formats use 'Expert-version' ");
    }
}
