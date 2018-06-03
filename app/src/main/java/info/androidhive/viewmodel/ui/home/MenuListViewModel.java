package info.androidhive.viewmodel.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import info.androidhive.viewmodel.model.MenuItem;

public class MenuListViewModel extends ViewModel {
    private MenuListRepository repository;
    private LiveData<List<MenuItem>> menuItems;

    public MenuListViewModel() {
        repository = new MenuListRepository();
    }

    public LiveData<List<MenuItem>> getMenuItems() {
        // Fetch data only when it's null
        if (menuItems == null) {
            menuItems = repository.getMenu();
        }

        return menuItems;
    }
}
