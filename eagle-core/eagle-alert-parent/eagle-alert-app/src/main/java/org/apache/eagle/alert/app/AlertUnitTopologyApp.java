/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eagle.alert.app;

import org.apache.eagle.alert.engine.UnitTopologyMain;
import org.apache.eagle.app.StormApplication;
import org.apache.eagle.app.environment.impl.StormEnvironment;
import backtype.storm.generated.StormTopology;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * since 8/25/16.
 */
public class AlertUnitTopologyApp extends StormApplication {
    @Override
    public StormTopology execute(Config config, StormEnvironment environment) {
        return UnitTopologyMain.createTopology(config);
    }

    public static void main(String[] args) {
        AlertUnitTopologyApp app = new AlertUnitTopologyApp();
        app.run(args);
    }
}
