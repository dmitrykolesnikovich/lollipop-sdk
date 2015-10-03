package lollipop.materialdrawer.model.interfaces;

import android.graphics.drawable.Drawable;

import lollipop.materialdrawer.holder.ImageHolder;
import lollipop.iconics.typeface.IIcon;

/**
 * Created by mikepenz on 03.02.15.
 */
public interface Iconable<T> {
    T withIcon(Drawable icon);

    T withIcon(IIcon iicon);

    T withIcon(ImageHolder icon);

    ImageHolder getIcon();
}
