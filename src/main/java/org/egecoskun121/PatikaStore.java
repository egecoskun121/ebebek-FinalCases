package org.egecoskun121;

import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore implements Store{

    private static final String name = "PatikaStore";
    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Brand> brands = new ArrayList<>();
    static{
        Brand Samsung = new Brand(1L,"Samsung",new ArrayList<>());
        Brand Lenovo = new Brand(2L,"Lenovo",new ArrayList<>());
        Brand Apple = new Brand(3L,"Apple",new ArrayList<>());
        Brand Huawei = new Brand(4L,"Huawei",new ArrayList<>());
        Brand Casper = new Brand(5L,"Casper",new ArrayList<>());
        Brand Asus = new Brand(6L,"Asus",new ArrayList<>());
        Brand HP = new Brand(7L,"HP",new ArrayList<>());
        Brand Xiaomi = new Brand(8L,"Xiaomi",new ArrayList<>());
        Brand Monster = new Brand(9L,"Monster",new ArrayList<>());
        brands.add(Samsung);
        brands.add(Lenovo);
        brands.add(Apple);
        brands.add(Huawei);
        brands.add(Casper);
        brands.add(Asus);
        brands.add(HP);
        brands.add(Xiaomi);
        brands.add(Monster);
        brands.sort(new BrandComparator());
    }




    public  void run() {
        while (true) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("PatikaStore Product Management Panel");

            System.out.println("1 - Notebook ");
            System.out.println("2 - Mobile Phone");
            System.out.println("3 - List Brands");
            System.out.println("0 - Exit");

            System.out.print("Your select: ");
            int select = scanner.nextInt();




            boolean isExit = false;
            switch (select) {
                case 1:
                    System.out.println("Notebook Menu");
                    notebookMenu();
                    break;

                case 2:
                    System.out.println("Mobile Phone Menu");
                    mobilePhoneMenu();
                    break;

                case 3:
                    listBrands(brands);
                    break;
                case 0:
                    isExit = true;
                default:
                    System.out.println();
                    System.out.println("There is no such an option. Please enter your choice again.");
                    System.out.println();

            }

            if (isExit) {
                System.out.println();
                System.out.println("You've left the store. See you soon.");
                return;
            }
        }
    }

    public static void listBrands(ArrayList<Brand> list){

        int index=0;
        System.out.println();
        System.out.println("BRANDS");
        System.out.println("--------------------------------");
        for (Brand brand:list) {
            index++;
            System.out.println(index+" - "+brand.getName());
        }
        System.out.println();
    }

    @Override
    public  void listMobilePhones() {

            // Mobile phone

            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(
                    "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size    | Battery    | RAM        | COLOR      |");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");



            if (!mobilePhones().isEmpty()) {
                for (MobilePhone mobilePhone : mobilePhones()) {
                    System.out.printf(
                            "| %-2s | %-30s| %-5s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s |\n",
                            mobilePhone.getId(), mobilePhone.getProductName(),mobilePhone.getUnitPrice(),mobilePhone.getBrand().getName(),mobilePhone.getStorage(),
                           mobilePhone.getScreenSize(), mobilePhone.getBatteryPower(), mobilePhone.getRAM(),
                            mobilePhone.getColor());
                }
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.println();
        }

      @Override
    public void listNotebooks() {

        // Notebooks

        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size     | RAM    |");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");



        if (!notebooks().isEmpty()) {
            for (Notebook notebook : notebooks()) {
                System.out.printf(
                        "| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                        notebook.getId(), notebook.getProductName(),notebook.getUnitPrice(),notebook.getBrand().getName(),notebook.getStorage(),
                        notebook.getScreenSize(), notebook.getRAM());
            }
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println();
    }




    @Override
    public  void addMobilePhone() {

        System.out.print("Choose brand: ");
        listBrands(brands);
        int brand=scanner.nextInt();


        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Discount Rate: ");
        int discountRate = scanner.nextInt();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Product Name: ");
        scanner.nextLine();
        String productName = scanner.nextLine();
        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        System.out.print("Color:");
        scanner.nextLine();
        String color=scanner.nextLine();
        System.out.print("Battery Power:");
        int batteryPower=scanner.nextInt();


        Brand b=null;
        switch (brand){
            case 1:
                 b = brands.get(0);
                break;
            case 2:
                b = brands.get(1);
                break;
            case 3:
                 b = brands.get(2);
                break;
            case 4:
                 b = brands.get(3);
                break;
            case 5:
                 b = brands.get(4);
                break;
            case 6:
                 b = brands.get(5);
                break;
            case 7:
                 b = brands.get(6);
                break;
            case 8:
                 b = brands.get(7);
                break;
            case 9:
                 b = brands.get(8);
                break;

        }

        MobilePhone phone = new MobilePhone(unitPrice,discountRate,stock,productName,b,ram,screenSize,storage,color,batteryPower);
        b.getProductList().add(phone);
    }

    @Override
    public  void addNotebook() {


        System.out.print("Choose brand: ");
        listBrands(brands);
        int brand=scanner.nextInt();
        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Discount Rate: ");
        int discountRate = scanner.nextInt();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Product Name: ");
        scanner.nextLine();
        String productName = scanner.nextLine();
        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();

        Brand b=null;
        switch (brand){
            case 1:
                b = brands.get(0);
                break;
            case 2:
                b = brands.get(1);
                break;
            case 3:
                b = brands.get(2);
                break;
            case 4:
                b = brands.get(3);
                break;
            case 5:
                b = brands.get(4);
                break;
            case 6:
                b = brands.get(5);
                break;
            case 7:
                b = brands.get(6);
                break;
            case 8:
                b = brands.get(7);
                break;
            case 9:
                b = brands.get(8);
                break;

        }

        Notebook notebook = new Notebook(unitPrice,discountRate,stock,productName,b,ram,screenSize,storage);
        b.getProductList().add(notebook);

    }

    public  void notebookMenu() {

        System.out.println("Notebook");

        System.out.println(".......................");
        System.out.println("1-List Items");
        System.out.println("2-Add Items");
        System.out.println("3-Delete Items");
        System.out.println("4-Filter Items");
        System.out.println("Make a choice");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                listNotebooks();
                break;
            case 2:
                addNotebook();
                break;
            case 3:
                deleteNotebook();
                break;
            case 4:
                notebookFilterMenu();
                break;
            default: {
                System.out.println();
                System.out.println("There is no such an option. Please enter your choice again.");
                notebookMenu();
            }

        }
    }

    public  void mobilePhoneMenu() {

        System.out.println("Mobile Phone");

        System.out.println(".......................");
        System.out.println("1-List Items");
        System.out.println("2-Add Items");
        System.out.println("3-Delete Items");
        System.out.println("4-Filter Items");
        System.out.println("Make a choice");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                listMobilePhones();
                break;
            case 2:
                addMobilePhone();
                break;
            case 3:
                deleteMobilePhone();
                break;
            case 4:
                mobilePhoneFilterMenu();
                break;
            default: {
                System.out.println();
                System.out.println("There is no such an option. Please enter your choice again.");
                mobilePhoneMenu();
            }

        }
    }






    @Override
    public void deleteMobilePhone( ) {

        System.out.print("Enter an ID value to delete: ");
        int idProduct = scanner.nextInt();
        boolean notExist = true;

            for (MobilePhone phone : mobilePhones()) {
                if (phone.getId() == idProduct) {
                    phone.getBrand().getProductList().remove(phone);
                    notExist = false;
                    System.out.println("The product with ID " + idProduct + " has been removed from the system.");
                    break;
                }
        }
        if (notExist) {
            System.out.println("The value ID is not found in the system. Please check your ID and try again...");
        }

    }

    public ArrayList<Notebook> notebooks(){
        ArrayList<Notebook> notebookArrayList=new ArrayList<>();
        for (Brand brand : brands ) {
            for(int i =0;i<brand.getProductList().size();i++){
                if(brand.getProductList().get(i) instanceof Notebook){
                    notebookArrayList.add((Notebook) brand.getProductList().get(i));
                }
            }
        }
        return notebookArrayList;
    }

    public ArrayList<MobilePhone> mobilePhones(){
        ArrayList<MobilePhone> mobilePhoneArrayList=new ArrayList<>();
        for (Brand brand : brands ) {
            for(int i =0;i<brand.getProductList().size();i++){
                if(brand.getProductList().get(i) instanceof MobilePhone){
                    mobilePhoneArrayList.add((MobilePhone) brand.getProductList().get(i));
                }
            }
        }
        return mobilePhoneArrayList;
    }

    @Override
    public void deleteNotebook() {
        System.out.print("Enter an ID value to delete: ");
        int idProduct = scanner.nextInt();
        boolean notExist = true;

        for (Notebook notebook :notebooks()) {
            if (notebook.getId() == Long.valueOf(idProduct)) {
                notebook.getBrand().getProductList().remove(notebook);
                notExist = false;
                System.out.println("The product with ID " + idProduct + " has been removed from the system.");
                break;
            }
        }
        if (notExist) {
            System.out.println("The value ID is not found in the system. Please check your ID and try again...");
        }

    }

    @Override
    public void FilterNotebookWithId() {
        System.out.print("Enter an ID to filter products");
        int idProduct = scanner.nextInt();
        boolean isExists=false;

                for (Notebook notebook : notebooks()) {
                    if (notebook.getId()==idProduct) {
                        isExists=true;
                       System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(
                                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size     | RAM    |");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------");

                                System.out.printf(
                                        "| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                                        notebook.getId(), notebook.getProductName(),notebook.getUnitPrice(),notebook.getBrand().getName(),notebook.getStorage(),
                                        notebook.getScreenSize(), notebook.getRAM());

                            System.out.println(
                                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                        System.out.println();
                    }
                if(!isExists){
                    System.out.println("The value ID is not found in the system. Please check your ID and try again...");
                }
    }

    public void FilterNotebookWithBrandName(){


        listBrands(brands);
        System.out.print("Choose brand: ");
        int brand=scanner.nextInt();
        // Notebooks

        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size     | RAM    |");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");

                    for(Product notebook:brands.get(brand-1).getProductList()){
                        if(notebook instanceof Notebook){
                            System.out.printf(
                                    "| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                                    ((Notebook) notebook).getId(), notebook.getProductName(),notebook.getUnitPrice(),notebook.getBrand().getName(),notebook.getStorage(),
                                    notebook.getScreenSize(), notebook.getRAM());
                        }
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------");

                        System.out.println();
                        }
                    }

    @Override
    public void FilterPhoneWithBrandName() {

        listBrands(brands);
        System.out.print("Choose brand: ");
        int brand=scanner.nextInt();

        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size    | Battery    | RAM        | COLOR      |");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------");


        for(Product mobilePhone:brands.get(brand-1).getProductList()){
            if(mobilePhone instanceof MobilePhone){
                System.out.printf(
                        "| %-2s | %-30s| %-5s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s |\n",
                        ((MobilePhone) mobilePhone).getId(), mobilePhone.getProductName(),mobilePhone.getUnitPrice(),mobilePhone.getBrand().getName(),mobilePhone.getStorage(),
                        mobilePhone.getScreenSize(), ((MobilePhone) mobilePhone).getBatteryPower(), mobilePhone.getRAM(),
                        ((MobilePhone) mobilePhone).getColor());
            }
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }

    public  void mobilePhoneFilterMenu() {

        System.out.println(".......................");
        System.out.println("1-Filter with ID");
        System.out.println("2-Filter with Brand Name");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                FilterPhoneWithId();
                break;
            case 2:
                FilterPhoneWithBrandName();
                break;
            default: {
                System.out.println();
                System.out.println("There is no such an option. Please enter your choice again.");
                mobilePhoneMenu();
            }
        }
    }

    public  void notebookFilterMenu() {

        System.out.println(".......................");
        System.out.println("1-Filter with ID");
        System.out.println("2-Filter with Brand Name");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                FilterNotebookWithId();
                break;
            case 2:
                FilterNotebookWithBrandName();
                break;
            default: {
                System.out.println();
                System.out.println("There is no such an option. Please enter your choice again.");
                notebookMenu();
            }
        }
    }

    public void FilterPhoneWithId(){
        System.out.print("Enter an ID to filter products");
        int idProduct = scanner.nextInt();
        boolean isExists=false;

        for (MobilePhone mobilePhone : mobilePhones()) {
            if (mobilePhone.getId()==idProduct) {
                isExists=true;
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size     | RAM    |");
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------------------------------");

                System.out.printf(
                        "| %-2s | %-30s| %-5s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s |\n",
                        mobilePhone.getId(), mobilePhone.getProductName(),mobilePhone.getUnitPrice(),mobilePhone.getBrand().getName(),mobilePhone.getStorage(),
                        mobilePhone.getScreenSize(), mobilePhone.getBatteryPower(), mobilePhone.getRAM(),
                        mobilePhone.getColor());
            }
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
        if(!isExists){
            System.out.println("The value ID is not found in the system. Please check your ID and try again...");
        }
    }

}
