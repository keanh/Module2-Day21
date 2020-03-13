public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrint listPrint;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrint listPrint) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrint = listPrint;
    }

    public void PrintRandomEvenList(int size, int min, int max){
        listPrint.printList(listFilter.filterOdd(randomList.generateList(size,min,max)));
    }
}
