// Generated by view binder compiler. Do not edit!
package com.example.pocketfresh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.pocketfresh.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityLaunchScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout relativeLayout2;

  private ActivityLaunchScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout relativeLayout2) {
    this.rootView = rootView;
    this.relativeLayout2 = relativeLayout2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLaunchScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLaunchScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_launch_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLaunchScreenBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout relativeLayout2 = (ConstraintLayout) rootView;

    return new ActivityLaunchScreenBinding((ConstraintLayout) rootView, relativeLayout2);
  }
}
