/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.edurt.gcm.netty.controller;

import io.edurt.gcm.netty.annotation.PostMapping;
import io.edurt.gcm.netty.annotation.RequestBody;
import io.edurt.gcm.netty.annotation.RestController;
import io.edurt.gcm.netty.model.TestSubClassModel;

@RestController
public class TestSubClassController
{
    @PostMapping(value = "sub/class")
    public Object sub(@RequestBody TestSubClassModel model)
    {
        return model;
    }
}
