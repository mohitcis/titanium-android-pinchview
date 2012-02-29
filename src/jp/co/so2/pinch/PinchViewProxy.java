/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package jp.co.so2.pinch;

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;


@Kroll.proxy(creatableInModule=PinchModule.class)
public class PinchViewProxy extends TiViewProxy
{
	private UIPinchView pinchView;

	// Constructor
	public PinchViewProxy()
	{
		super();
	}

	@Override
	public TiUIView createView(Activity activity)
	{
		pinchView = new UIPinchView(this);
		return pinchView;
	}
	
	@Kroll.setProperty
	@Kroll.method
	public void setMaxZoomValue(float maxZoom)
	{
		pinchView.setMaxZoomValue(maxZoom);
	}
	
	@Kroll.setProperty
	@Kroll.method
	public void setMinZoomValue(float minZoom)
	{
		pinchView.setMinZoomValue(minZoom);
	}
	
	@Kroll.setProperty
	@Kroll.method
	public void setCurZoomValue(float curZoom)
	{
		pinchView.setCurZoomValue(curZoom);
	}
}