
void main()
{
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(1,100);
    map.put(2,200);
    map.put(3,300);
    System.out.println(map.get(1) + map.get(2) + map.get(3));
    System.out.println(" " +map.get(4));
}