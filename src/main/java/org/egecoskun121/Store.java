package org.egecoskun121;

public interface Store {
    void listNotebooks();
    void listMobilePhones();

    void addNotebook();

    void addMobilePhone();
    void deleteMobilePhone();
    void deleteNotebook();
    void FilterPhoneWithId();

    void FilterNotebookWithBrandName();

    void FilterNotebookWithId();
    void FilterPhoneWithBrandName();
}
