public class BubbleSortString {
    private String[] name;

    public BubbleSortString(){
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] nama) {
        this.name = nama;
    }

    public void SortData(){

        for (int i = 0; i < this.name.length; i++) {
            for (int j = i + 1; j < this.name.length; j++) {
                if (this.name[j].compareToIgnoreCase(this.name[i]) < 0) {
                    String temp = this.name[i];
                    this.name[i] = this.name[j];
                    this.name[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (String nameData : this.name){
            System.out.println(nameData + " ");
        }
    }

    public static void main(String[] args) {
        String[] friendsName = {"Aji", "Julian", "Afif", "Annur", "Hasnita", "Adi", "Faqih", "Jodi", "Maudy", "Yesa"};
        System.out.println("Sebelum diurutkan");
        for (String nameData : friendsName){
            System.out.println(nameData + " ");
        }

        System.out.println("\nSetelah diurutkan");
        BubbleSortString urut = new BubbleSortString();
        urut.setName(friendsName);
        urut.SortData();
        urut.PrintData();
    }

}
