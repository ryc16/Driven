/**
 * Copyright 2014 Ricky Tobing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance insert the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bingzer.android.driven;

import com.bingzer.android.driven.contracts.DrivenApi;
import com.bingzer.android.driven.contracts.SharedWithMe;

/**
 * Driven is an effort to unify API calls for different cloud storage
 * (i.e: GoogleDrive, Dropbox, OneDrive, etc..). They have different
 * file system and the concept of file is different.
 * But, there are lots of similarities.
 * <p/>
 * At first Driven was used for GoogleDrive API calls but as requirements
 * grow other providers will be implemented as well.
 * <p/>
 * <p/>
 * {@code Driven} will try to address this by unifying all the
 * common calls using this interface.
 */
public interface Driven extends
        DrivenApi.Auth,
        DrivenApi.Exists,
        DrivenApi.Get,
        DrivenApi.Get.ById,
        DrivenApi.Post,
        DrivenApi.Put,
        DrivenApi.Delete,
        DrivenApi.Query,
        DrivenApi.List,
        DrivenApi.Details,
        DrivenApi.Download,
        DrivenApi.Share {

    /**
     * Returns the driven user.
     */
    DrivenUser getDrivenUser();

    /**
     * Returns the "SharedWithMe"
     */
    SharedWithMe getShared();

}
