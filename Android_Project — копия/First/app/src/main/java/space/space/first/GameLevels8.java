package space.space.first;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Window;

import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.app.ActivityCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;

public interface GameLevels8 extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, LifecycleOwner, HasDefaultViewModelProviderFactory, ActivityResultRegistryOwner, ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator, TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider {
    // Системна кнопка "Назад"-начало
    void onBonBackPressed();
}
