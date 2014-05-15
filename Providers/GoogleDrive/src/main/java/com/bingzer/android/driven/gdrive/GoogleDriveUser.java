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
package com.bingzer.android.driven.gdrive;

import com.bingzer.android.driven.DrivenUser;
import com.google.api.services.drive.model.About;

/**
 * Simple wrapper for user that has authenticate
 * DrivenAPI to their GoogleDrive API
 */
class GoogleDriveUser implements DrivenUser {
    private String name;
    private String displayName;
    private String emailAddress;

    protected GoogleDriveUser(About about){
        name = about.getName();
        displayName = about.getUser().getDisplayName();
        emailAddress = about.getUser().getEmailAddress();
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "GoogleDriveUser{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
