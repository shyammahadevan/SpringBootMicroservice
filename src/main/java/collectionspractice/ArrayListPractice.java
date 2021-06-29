package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayListPractice arraylistPractice = new ArrayListPractice();
        String[] name = listNow.toArray(new String[5]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the elem");
        for (int i = 0; i < 5; i++) {
            name[i] = scanner.next();
        }
        ArrayList<String[]> myList = arraylistPractice.addMany(name);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(Arrays.toString(myList.get(i)));
        }
    }

    static List<String> listNow = new ArrayList<String>();

    public void addAData(String data) {
        if (listNow.size() == 5) {
            System.out.println("not able to add data");
        } else {
            listNow.add(data);
        }
    }

    public void disp() {
        for (String updatedList : listNow) {
            System.out.println(updatedList);
        }
    }

    public ArrayList<String[]> addMany(String[] addMany) {
        for (String addIt : addMany) {
            listNow.add(addIt);

        }
        ArrayList<String[]> arrayList = new ArrayList<>();
        arrayList.add(addMany);
        return arrayList;
    }


}
