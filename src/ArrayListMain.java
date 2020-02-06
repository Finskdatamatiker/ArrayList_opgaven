public class ArrayListMain {
    public static void main(String[] args) {
        FinskArrayList finskArrayList = new FinskArrayList();

        finskArrayList.add(3);
        System.out.println("add value 3: " + finskArrayList.toString());

        finskArrayList.add(5);
        System.out.println("add value 5: " + finskArrayList.toString());

        finskArrayList.add(8);
        System.out.println("add value 8: " + finskArrayList.toString());

        finskArrayList.add(2);
        System.out.println("add value 2: " + finskArrayList.toString());

        try {
            finskArrayList.remove(5);
        }catch (IndexOutOfBoundsException ie){
            System.out.println("\nugyldig index, element kan ikke slettes " + ie + "\n");
        }

        try {
            finskArrayList.addTilIndex(1, 7);
            System.out.println("add value 7 i index 1: " + finskArrayList.toString());
        }catch (IndexOutOfBoundsException ie){
            System.out.println("\nugyldig index, element kan ikke tilføjes " + ie + "\n");
        }

        finskArrayList.remove(2);
        System.out.println("remove index 2: " + finskArrayList.toString());

        finskArrayList.clear();
        System.out.println("tøm listen: " + finskArrayList.toString());

        try {
            finskArrayList.addTilIndex(4, 8);
            System.out.println("add value 8 i index 4: " + finskArrayList.toString());
        }catch (IndexOutOfBoundsException ie){
            System.out.println("\nugyldig index, element kan ikke tilføjes " + ie + "\n");
        }

        finskArrayList.add(4);
        System.out.println("add 4: " + finskArrayList.toString());

    }
}
