public class CellTest {
    public static void main(String args[]) {
        Cell cell1 = new Cell();
        cell1.setPosition(new Position(0, 0));
        cell1.setContent("我");

        Cell cell2 = new Cell();
        cell2.setPosition(new Position(0, 0));
        cell2.setContent("我");

        System.out.println(cell1.toString());
        System.out.println(cell2.toString());
        System.out.println(cell1.toString().equals(cell2.toString()));

        cell2.getPosition().setX(1);
        System.out.println(cell1.toString());
        System.out.println(cell2.toString());
        System.out.println(cell1.toString().equals(cell2.toString()));

        cell2.setContent("欲");
        System.out.println(cell1.toString());
        System.out.println(cell2.toString());
        System.out.println(cell1.toString().equals(cell2.toString()));
    }
}
