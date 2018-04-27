package info.androidhive.viewmodel.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.util.List;

import info.androidhive.viewmodel.model.MenuItem;
import info.androidhive.viewmodel.networking.WebClient;
import info.androidhive.viewmodel.networking.WebService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuItemRepository {
    private static final String TAG = MenuItemRepository.class.getSimpleName();

    private WebService webClient;

    public MenuItemRepository() {
        webClient = WebClient.getClient().create(WebService.class);
    }

    public LiveData<List<MenuItem>> getMenu() {
        final MutableLiveData<List<MenuItem>> data = new MutableLiveData<>();

        Call<List<MenuItem>> call = webClient.getMenu();
        call.enqueue(new Callback<List<MenuItem>>() {
            @Override
            public void onResponse(Call<List<MenuItem>> call, Response<List<MenuItem>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<MenuItem>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
        return data;
    }
}
