package lollipop.materialdrawer.model.interfaces;

import lollipop.materialdrawer.holder.StringHolder;

/**
 * Created by mikepenz on 03.02.15.
 */
public interface Badgeable<T> {
    T withBadge(String badge);

    T withBadge(int badgeRes);

    T withBadge(StringHolder badgeRes);

    StringHolder getBadge();
}
