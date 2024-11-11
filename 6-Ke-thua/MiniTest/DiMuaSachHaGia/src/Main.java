public class Main {
    public static void main(String[] args) {
        Books[] books = new Books[6];

        books[0] = new ProgrammingBook("jv1","JAVA01","chatGPT",95,"Java","1");
        books[1] = new ProgrammingBook("jv2","lethimcook","Sown",95,"khongphaiJAVA","2");
        books[2] = new ProgrammingBook("jv3","JAVA03","chatGPT",95,"Java","3");


        books[3] = new FictionBook("1","Vien Tuong1","copilot",93,"Vien Tuong 1");
        books[4] = new FictionBook("2","Vien Tuong2","claude",93,"Vien Tuong 1");
        books[5] = new FictionBook("3","Vien Tuong3","khongphaiSon",93,"Vien Tuong");


        int sum = 0;
        for (Books book : books) {
            sum += book.getPrice();

        }
        System.out.println("tong so tien: "+sum);


        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook book = (ProgrammingBook) books[i];
                if (book.getLanguage().equals("Java")) {
                    count++;
                }
            }

        }
        System.out.println("Tong so sach JAVA: "+count);


        int count2 = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook book = (FictionBook) books[i];
                if (book.getCategory().equals("Vien Tuong 1")) {
                    count2++;
                }
            }
        }
        System.out.println("Tong so sach vien tuong 1 la : "+count2);


        int count3 = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                if (books[i].getPrice()<100){
                    count3++;
                }
            }
        }
        System.out.println("Tong so sach vien tuong la : "+count3);
    }

}