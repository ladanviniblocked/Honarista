package entity;

public class IsSelling {
	//ATTRIBUTES
	int _count;
	Shop _shop;
	Item _item;
	boolean _isOnSale;
	
	/*TODO
	 * DATES
	 */
	//CONSTRUCTORS
	public IsSelling(){
		_count = 0;
		_shop = null;
		_item = null;
	}
	public IsSelling(Shop shop, Item item, int count){
		_shop = shop;
		_item = item;
		_count = count;
	}
	public IsSelling(int sId, int iId, int count){
		_shop.setId(sId);
		_item.setID(iId);
		_count = count;
		
	}
	//GETTERS
	public int getCount() { return _count; }
	public Shop getShop() { return _shop; }
	public Item getItem() { return _item; }
	//SETTERS
	public void setCount(int count) { _count = count; }
	public void setShop(Shop shop) { _shop = shop; }
	public void setItem(Item item) { _item = item; }
}
