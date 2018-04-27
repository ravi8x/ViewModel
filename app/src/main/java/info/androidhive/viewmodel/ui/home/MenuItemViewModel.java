package info.androidhive.viewmodel.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import info.androidhive.viewmodel.model.MenuItem;

public class MenuItemViewModel extends ViewModel {
    private MenuItemRepository repository;
    private LiveData<List<MenuItem>> menuItems;

    public MenuItemViewModel() {
        repository = new MenuItemRepository();
    }

    public LiveData<List<MenuItem>> getMenuItems() {
        // fetch data only when it's null
        if (menuItems == null) {
            menuItems = repository.getMenu();
        }

        return menuItems;
    }
}
