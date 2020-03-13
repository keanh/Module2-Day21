public class Client {
    public void UseRandomListFacade(int size, int min, int max){
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListFilter(), new ListPrint());
        randomListFacade.PrintRandomEvenList(size,min,max);
    }
}
