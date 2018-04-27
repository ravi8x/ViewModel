package info.androidhive.viewmodel.networking;

import java.util.List;

import info.androidhive.viewmodel.model.MenuItem;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WebService {

    @GET("menu.json")
    Call<List<MenuItem>> getMenu();
}
