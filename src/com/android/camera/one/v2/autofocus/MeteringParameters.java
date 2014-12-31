/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.camera.one.v2.autofocus;

import android.graphics.PointF;

class MeteringParameters {
    public static enum Mode {
        POINT,
        GLOBAL
    };

    private final PointF mAFPoint;
    private final PointF mAEPoint;
    private final Mode mMode;

    public MeteringParameters(PointF afPoint, PointF aePoint, Mode mode) {
        mAFPoint = afPoint;
        mAEPoint = aePoint;
        mMode = mode;
    }

    public static MeteringParameters createGlobal() {
        return new MeteringParameters(new PointF(), new PointF(), Mode.GLOBAL);
    }

    public PointF getAFPoint() {
        return mAFPoint;
    }

    public PointF getAEPoint() {
        return mAEPoint;
    }

    public Mode getMode() {
        return mMode;
    }
}
