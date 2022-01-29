package codewars.five;

import java.util.List;

public class PaginationHelper<I> {
    private final Integer itemsPerPage;
    private final List<I> collection;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    //items amount
    public int itemCount() {
        return collection.size();
    }

    //pages amount
    public int pageCount() {
        return itemCount() % itemsPerPage != 0 ? itemCount() / itemsPerPage + 1 : itemCount() / itemsPerPage;
    }

    //amount of items in some page
    public int pageItemCount(int pageIndex) {
        int e = (collection.size() - pageIndex * itemsPerPage);
        return (e >= 0 && pageIndex >= 0) ? e >= itemsPerPage ? itemsPerPage : e : -1;
    }

    //which page contain some item by index
    public int pageIndex(int itemIndex) {
        return (itemIndex < itemCount() && itemIndex >= 0) ? itemIndex / itemsPerPage : -1;
    }
}
