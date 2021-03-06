/*
Copyright (C) 1999 CERN - European Organization for Nuclear Research.
Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose 
is hereby granted without fee, provided that the above copyright notice appear in all copies and 
that both that copyright notice and this permission notice appear in supporting documentation. 
CERN makes no representations about the suitability of this software for any purpose. 
It is provided "as is" without expressed or implied warranty.
 */
package com.cern.colt.buffer.tboolean;

import com.cern.colt.list.tboolean.BooleanArrayList;

/**
 * Target of a streaming <tt>BooleanBuffer2D</tt> into which data is flushed
 * upon buffer overflow.
 * 
 * @author wolfgang.hoschek@cern.ch
 * @version 1.0, 09/24/99
 * @author Piotr Wendykier (piotr.wendykier@gmail.com)
 */
public interface BooleanBuffer2DConsumer {
    /**
     * Adds all specified (x,y) points to the receiver.
     * 
     * @param x
     *            the x-coordinates of the points to be added.
     * @param y
     *            the y-coordinates of the points to be added.
     */
    public void addAllOf(BooleanArrayList x, BooleanArrayList y);
}
