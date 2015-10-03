package lollipop.materialdrawer.model.interfaces;

import lollipop.materialdrawer.holder.BadgeStyle;

/**
 * Created by mikepenz on 03.02.15.
 */
public interface ColorfulBadgeable<T> extends Badgeable<T> {
    T withBadgeStyle(BadgeStyle badgeStyle);

    BadgeStyle getBadgeStyle();

}
