 /*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 /**
 * Project  : MapleFetion2
 * Package  : net.solosky.maplefetion.sipc
 * File     : SipcStatus.java
 * Author   : solosky < solosky772@qq.com >
 * Created  : 2010-1-11
 * License  : Apache License 2.0 
 */
package net.solosky.maplefetion.sipc;

/**
 *
 * SIPC请求状态
 *
 * @author solosky <solosky772@qq.com>
 */
public interface SipcStatus
{
	
	public static final int TRYING = 100;				//操作已经成功接收，正在操作中
	public static final int ACTION_OK = 200;			//操作成功
	public static final int SEND_SMS_OK = 280;			//发送手机短信成功
	
	public static final int NOT_AUTHORIZED = 401;		//需要验证
	public static final int NOT_FOUND = 404;			//未找到
	
	public static final int SERVER_UNAVAILABLE = 503;	// 服务暂时不可用
	public static final int TA_EXIST = 521;				//对方已经存在
	public static final int NO_SUBSCRIPTION = 522;		//没有定义
}
