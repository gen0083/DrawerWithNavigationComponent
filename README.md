Drawer with Navigation Component
===

This is a sample project to get some issues with Navigation AAC.

## Environment

Develop machine:

- Android Studio 3.3
- Navigation component: 1.0.0-alpha9

Run device:

- Essential Products(PH-1)
- Android 9.0.0

## Issue

When rotate device, multiple drawer menu is checked

![multiple item checked when rotating device](./multiple_item_checked_when_rotating.gif)

I faced this under the following conditions:

- NavigationDrawer that has more than 2 menu groups
- groups have different `checkedBehavior` (in this project, one of `single` and one of `none`)

if groups have same `checkedBehavior` (like `single` and `single` or `none` and `none`), then this issue dose not occurred. 

<https://issuetracker.google.com/issues/123151146>

## ~~Issue 2~~

<del>
This is feature request.

Please provide a chance to change transition animation using NavigationUI.

Reason:

When using NavigationUI, transition animation is set fade as force.
In most case there will be no problem but in some situations are not.
Here is one of them.

![looks flickering on navigation](./looks_flickering.gif)

This happened under the following conditions:

- ViewPager host that has colored background
- ViewPager child that has no background color (transparent)
- ViewPager child has BottomSheet that has white background color
- navigate from ViewPager host to other fragment, it looks flickering

This can be avoided to set transition animation only exit side.
But for now, we cannot do it with NavigationUI.
</del>

This is intended behavior:
<https://issuetracker.google.com/issues/110429064>
<https://issuetracker.google.com/issues/118790649>

If we want to customize animation, overwrite `R.anim.nav_default_enter_anim` etc.