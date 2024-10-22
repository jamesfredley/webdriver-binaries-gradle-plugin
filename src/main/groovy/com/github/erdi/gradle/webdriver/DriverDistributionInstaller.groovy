/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.erdi.gradle.webdriver

import com.github.erdi.gradle.webdriver.repository.VersionAndUri
import org.gradle.api.Project
import org.ysb33r.grolifant.api.core.ProjectOperations
import org.ysb33r.grolifant.api.core.downloader.AbstractDistributionInstaller

class DriverDistributionInstaller extends AbstractDistributionInstaller {

    private final URI uri

    DriverDistributionInstaller(Project project, File downloadRoot, String driverName, VersionAndUri versionAndUri) {
        super(driverName, "webdriver/$driverName/$versionAndUri.version", ProjectOperations.create(project))
        this.downloadRoot = downloadRoot
        this.uri = versionAndUri.uri
    }

    @Override
    URI uriFromVersion(String version) {
        uri
    }

    @Override
    protected File verifyDistributionRoot(File distDir) {
        distDir
    }

}
