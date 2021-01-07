package luizramos.testandodraweractivity.ui.gallery;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText2;
    private MutableLiveData<String> url;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText2 = new MutableLiveData<>();
        url = new MutableLiveData<>();

        mText.setValue("Testando a gallery fragment");
        mText2.setValue("Testando2 a gallery fragment2");

        url.setValue("https://www.udemy.com");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getText2() {
        return mText2;
    }
    public LiveData<String> getWebView(){
        return  url;
    }
}