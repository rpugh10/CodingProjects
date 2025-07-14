public class Printer {
    
    public static int totalPagePrinted;

    private int printerId;
    private int pagesPrinted;
    
    public Printer(int printerId, int pagesPrinted) {
        this.printerId = printerId;
        this.pagesPrinted = 0;
    }

    public void print(int pages)
    {
        pagesPrinted += pages;
        totalPagePrinted += pages;
    }

    public static int getTotalPagePrinted() {
        return totalPagePrinted;
    }

    public static void setTotalPagePrinted(int totalPagePrinted) {
        Printer.totalPagePrinted = totalPagePrinted;
    }

    public int getPrinterId() {
        return printerId;
    }

    public void setPrinterId(int printerId) {
        this.printerId = printerId;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    @Override
    public String toString() {
        return "Printer [printerId=" + printerId + ", pagesPrinted=" + pagesPrinted + "]";
    }

    
    public static void main(String[] args)
    {
        Printer printer1 = new Printer(1, 34);
        Printer printer2 = new Printer(2, 44);

        printer1.print(12);
        printer2.print(4);

        System.out.println("Number of pages printer 1 printed: " + printer1.getPagesPrinted());
        System.out.println("Number of pages printer 2 printed: " + printer2.getPagesPrinted());

        System.out.println("Total number of pages printed: " + Printer.getTotalPagePrinted());

     }   
    
    

}
