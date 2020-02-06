public class ArrayListMain {
    public static void main(String[] args) {
        FinskArrayList finskArrayList = new FinskArrayList();

        finskArrayList.add(3);
        finskArrayList.add(5);
        finskArrayList.add(8);
        finskArrayList.add(2);
        System.out.println(finskArrayList.toString());

        try {
            finskArrayList.remove(5);
        }catch (IndexOutOfBoundsException ie){
            System.out.println("ugyldig index, element kan ikke slettes " + ie);
        }

        try {
            finskArrayList.addTilIndex(1, 7);
            System.out.println("add value 7 i index 1: " + finskArrayList.toString());
        }catch (IndexOutOfBoundsException ie){
            System.out.println("ugyldig index, element kan ikke tilføjes " + ie);
        }

        finskArrayList.remove(2);
        System.out.println("remove index 2: " + finskArrayList.toString());

        finskArrayList.clear();
        System.out.println("tøm listen: " + finskArrayList.toString());

        try {
            finskArrayList.addTilIndex(4, 8);
            System.out.println("add value 8 i index 4: " + finskArrayList.toString());
        }catch (IndexOutOfBoundsException ie){
            System.out.println("ugyldig index, element kan ikke tilføjes " + ie);
        }

        finskArrayList.add(4);
        System.out.println("add 4: " + finskArrayList.toString());

    }
}
