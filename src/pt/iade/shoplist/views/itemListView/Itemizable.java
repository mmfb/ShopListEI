package pt.iade.shoplist.views.itemListView;

public interface Itemizable {
	default String[] getDescription() {
		return new String[] { getName() };
	}
	String getName();
}
