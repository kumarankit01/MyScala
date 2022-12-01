package aoc22

object CaloriesCount extends App {
  val cal = "6669\n6434\n6564\n1032\n1098\n1829\n2608\n7322\n2690\n7061\n1664\n5769\n\n6160\n1082\n3958\n5272\n2188\n5618\n3418\n2302\n2926\n3338\n1082\n2024\n4195\n4083\n\n3276\n5581\n3421\n3403\n4356\n2989\n1278\n1868\n3630\n4702\n3409\n4887\n2383\n\n7104\n7496\n5265\n8078\n8788\n7402\n3601\n2641\n1252\n4994\n\n4074\n7524\n8889\n9290\n8892\n5785\n2163\n1074\n6747\n\n7452\n8006\n12427\n7919\n4012\n6850\n\n34591\n26861\n\n13028\n12695\n12762\n11006\n15937\n\n17218\n12408\n17554\n11415\n\n1118\n7240\n6400\n3431\n1032\n3283\n4667\n6100\n5076\n1101\n6952\n3527\n\n7633\n4385\n4510\n4073\n3052\n11738\n\n33554\n\n3448\n16054\n10839\n\n4496\n2697\n4731\n5150\n5327\n4039\n4004\n2148\n6150\n4001\n2882\n5780\n4327\n\n4095\n2064\n6701\n3828\n2427\n4775\n2583\n2000\n1390\n7391\n1701\n3796\n\n10355\n1262\n8781\n6350\n\n11053\n11527\n1389\n6007\n12383\n11033\n\n7951\n4258\n9815\n10061\n7579\n3769\n11431\n\n3597\n35622\n\n2129\n2994\n4260\n5269\n4179\n1612\n3509\n3581\n4544\n3713\n3202\n6458\n1203\n1095\n\n17196\n13475\n12666\n\n3549\n6432\n6593\n6723\n1272\n4023\n2112\n2844\n5135\n5103\n1585\n4773\n5635\n\n8731\n16378\n5076\n2999\n\n11136\n1525\n8684\n9731\n9753\n5366\n7399\n\n8996\n1483\n4922\n1191\n2761\n9333\n9247\n3797\n3940\n\n5876\n4139\n2158\n5905\n5445\n2438\n2814\n3853\n3432\n2289\n5783\n3839\n2811\n4361\n\n3260\n6058\n3620\n2171\n4387\n4011\n4552\n1646\n3400\n2941\n6776\n2793\n6702\n\n2318\n3118\n4920\n1293\n5593\n2308\n6819\n5949\n3819\n1742\n1074\n4565\n5891\n\n5260\n8430\n6832\n6248\n2162\n7770\n1692\n4345\n7140\n6748\n\n2921\n2075\n6039\n2875\n1479\n5835\n2350\n5981\n2684\n2560\n1608\n1495\n1358\n2047\n5003\n\n13864\n8452\n10716\n6642\n14875\n\n9704\n7477\n3664\n7751\n11616\n11067\n3496\n\n12744\n11268\n7987\n15133\n\n2859\n6255\n1302\n4053\n6133\n4181\n3008\n3450\n4421\n6065\n2732\n7142\n\n7502\n3436\n2987\n8648\n1103\n1477\n7647\n9669\n6285\n\n69741\n\n60977\n\n3987\n10933\n1170\n12375\n\n6773\n2923\n8707\n3434\n5872\n5793\n5573\n6338\n7182\n2158\n\n5522\n5345\n4425\n6178\n5236\n1397\n6165\n2173\n3547\n5225\n3949\n2238\n2594\n6032\n\n7998\n6850\n1552\n3087\n6978\n7829\n1957\n1432\n7504\n2382\n3534\n\n16000\n12845\n12638\n8250\n\n5712\n1853\n2986\n6472\n1543\n1147\n5670\n5085\n3519\n5847\n4603\n1394\n2353\n1668\n\n3542\n2995\n5413\n1108\n1783\n3902\n5173\n4228\n3997\n1759\n5652\n5896\n2109\n5697\n4198\n\n3625\n7049\n4471\n11613\n1668\n9077\n3143\n\n4473\n3397\n12107\n1364\n5698\n8030\n12081\n\n2337\n3212\n3567\n1115\n3963\n1753\n1769\n6966\n3093\n4758\n5271\n3635\n\n4387\n3770\n2931\n3029\n2657\n1109\n1592\n4884\n5784\n1911\n2938\n2501\n5851\n3793\n\n1438\n7877\n7911\n2781\n1486\n4302\n6924\n3930\n6489\n\n3794\n5964\n3072\n2292\n5199\n2157\n2357\n3649\n4888\n4522\n5408\n4743\n2753\n1717\n\n8856\n7753\n8504\n1696\n5469\n7135\n7838\n6572\n4414\n\n3860\n6400\n4018\n4506\n6979\n5493\n1950\n2544\n7426\n1405\n6440\n6253\n\n8397\n2488\n4483\n3346\n8035\n3996\n6236\n4951\n2849\n6277\n\n2113\n5149\n2409\n3971\n2762\n1704\n1799\n3929\n3224\n2149\n5804\n2026\n2269\n1107\n3140\n\n2851\n10610\n\n2901\n2215\n3138\n4848\n2612\n5624\n4878\n4137\n4093\n4660\n3369\n1970\n1176\n2141\n2298\n\n50004\n\n37286\n4713\n\n2844\n1432\n2303\n4938\n3770\n1589\n5731\n5173\n3512\n5820\n3910\n6687\n\n8039\n11639\n2325\n11278\n8313\n\n7488\n15716\n1889\n4665\n\n10258\n1862\n10452\n8650\n8039\n8984\n8778\n6486\n\n8827\n12823\n25875\n\n4658\n12284\n10171\n5966\n13525\n\n7011\n2322\n8908\n8383\n3992\n\n8965\n4198\n18224\n19587\n\n5325\n20017\n\n13271\n10542\n5223\n3178\n\n1563\n4352\n6234\n2095\n1565\n1904\n6494\n6102\n3930\n4529\n5226\n5391\n1159\n4928\n\n1588\n4779\n3001\n3698\n5784\n5327\n2149\n3020\n5362\n5751\n5704\n3296\n4746\n2595\n3169\n\n5627\n24442\n5459\n\n1867\n7808\n1287\n4179\n1395\n5759\n3916\n3549\n7235\n1740\n3753\n\n11451\n8529\n1874\n6475\n1205\n8217\n9286\n\n2929\n3725\n6071\n2336\n1725\n7049\n2041\n1694\n1231\n\n3587\n6327\n8078\n4723\n10069\n5008\n8537\n7827\n\n4148\n4758\n3453\n1189\n5086\n1045\n2429\n5157\n4454\n3198\n3080\n5980\n6011\n3575\n5044\n\n7858\n7552\n7965\n3623\n7309\n4740\n6151\n1926\n2370\n6310\n\n1734\n11654\n8498\n\n2099\n4433\n3831\n6238\n4152\n1749\n4146\n5282\n3683\n4976\n5297\n1710\n4181\n4213\n\n1981\n1318\n5839\n4815\n6083\n3841\n2842\n3246\n3884\n5193\n3451\n5147\n2518\n\n2960\n3167\n5279\n2233\n6509\n5722\n3576\n6488\n4366\n1564\n6941\n\n7515\n1502\n4892\n4008\n3196\n1730\n7263\n5971\n6213\n6673\n7824\n\n5835\n\n2444\n4473\n6654\n2285\n2184\n6397\n3411\n2602\n5380\n6952\n1234\n1474\n6842\n\n3876\n7019\n1240\n6349\n4016\n2340\n8085\n1932\n5186\n4549\n6375\n\n19405\n2299\n5583\n\n13376\n12685\n9717\n12221\n2883\n\n9537\n8867\n13398\n6781\n13954\n\n2874\n1486\n5232\n5947\n2140\n7588\n1404\n8295\n6127\n7705\n\n22842\n26153\n\n8396\n2626\n3725\n5917\n2949\n1524\n\n30131\n\n5851\n1366\n3574\n1450\n5377\n6713\n3783\n3281\n4981\n6910\n5229\n4359\n\n9099\n2211\n2814\n4583\n4690\n7122\n9334\n\n17546\n\n1378\n6567\n5300\n3819\n5604\n5316\n7159\n3564\n4302\n1442\n5763\n6610\n\n1891\n8030\n3579\n4977\n3620\n2421\n7637\n1481\n9177\n\n3298\n3865\n6812\n5409\n6482\n7245\n7049\n4319\n3040\n6027\n7195\n6023\n\n28329\n\n3409\n4600\n6903\n4511\n4341\n6742\n6967\n4247\n6802\n3453\n1515\n\n2517\n13539\n3030\n11819\n\n2974\n3749\n3971\n4509\n9599\n1036\n8176\n\n1000\n2863\n1029\n2452\n2286\n2891\n5244\n3929\n5734\n2075\n5107\n2622\n4680\n1847\n\n9653\n4720\n5078\n1589\n2431\n3149\n3261\n7308\n6953\n\n5916\n7409\n3773\n7286\n4552\n9685\n2114\n\n38289\n\n1591\n10416\n3921\n16121\n\n3217\n10969\n5198\n9305\n8671\n9606\n9759\n\n60758\n\n26875\n\n12555\n12735\n14656\n4437\n4307\n\n1528\n4259\n3310\n5563\n2281\n4305\n2573\n5733\n2725\n1519\n3299\n2055\n4674\n6146\n\n21988\n17405\n15500\n\n1775\n3126\n5002\n9407\n6048\n3346\n8368\n2185\n2825\n\n24510\n\n25200\n37377\n\n9852\n1000\n2688\n11027\n11129\n11742\n\n16298\n12093\n16906\n1567\n\n1677\n3068\n6035\n6271\n6344\n5794\n1933\n6032\n4308\n6874\n6225\n1046\n6712\n\n2194\n4404\n8838\n6737\n8595\n2478\n1033\n3489\n\n5439\n14385\n13397\n3570\n13810\n\n1726\n5761\n4318\n2813\n3351\n3168\n1539\n3847\n4422\n6071\n3376\n1093\n1979\n3206\n4011\n\n2491\n4041\n3106\n2550\n3206\n5553\n3473\n5805\n1934\n4179\n1963\n4113\n3996\n2351\n3437\n\n8747\n3481\n11813\n7672\n4711\n\n4393\n2158\n3121\n6931\n7801\n3706\n4801\n3971\n1195\n1553\n1058\n\n20051\n11463\n\n1299\n6007\n6845\n1866\n2461\n3548\n4175\n\n10323\n9098\n5566\n8553\n8768\n1022\n10088\n\n5388\n4289\n5067\n5871\n5451\n4891\n8796\n6506\n3323\n\n2652\n1923\n5235\n1539\n9256\n5794\n6153\n1379\n3568\n\n12764\n15021\n11371\n1577\n4189\n\n1960\n7462\n6862\n6710\n2350\n1689\n8322\n1575\n5367\n1074\n\n4411\n4588\n3164\n1456\n6084\n2628\n5635\n2845\n3593\n3027\n6316\n5661\n2890\n2470\n\n5592\n5071\n4290\n4402\n6091\n2907\n1531\n6229\n6159\n1791\n3833\n2435\n3919\n3160\n\n18373\n2699\n6711\n14268\n\n7693\n1264\n4217\n5299\n3786\n4555\n1112\n3392\n2535\n6768\n3618\n\n11723\n6939\n7761\n\n15672\n15601\n13101\n6229\n\n23344\n\n7787\n4343\n6661\n2629\n3189\n5155\n7999\n2351\n1308\n2726\n3177\n\n18631\n18125\n\n9177\n3897\n3655\n3449\n8336\n4366\n3363\n2145\n8594\n\n1820\n9067\n2171\n2487\n15998\n\n16221\n3430\n14946\n6869\n5305\n\n4483\n7157\n1588\n2629\n5109\n7299\n1688\n4386\n6960\n6538\n1525\n\n1289\n1340\n1520\n3601\n4316\n2653\n6140\n6219\n5044\n4306\n2573\n4028\n1828\n5844\n\n7277\n5775\n2893\n3958\n6228\n6786\n7203\n7119\n5786\n6477\n\n4367\n10361\n5973\n9197\n2832\n7900\n6711\n8279\n\n9606\n6118\n10025\n10242\n8279\n8938\n6688\n7905\n\n2478\n1918\n5575\n1840\n4897\n5871\n6309\n2778\n1937\n5396\n3249\n3456\n1002\n\n12936\n11011\n11487\n11919\n13937\n8622\n\n3853\n13287\n8285\n7842\n\n11250\n7923\n8049\n3931\n7625\n4918\n\n6516\n8209\n1752\n6258\n8501\n7426\n\n10432\n3916\n12055\n13687\n1774\n8053\n\n4682\n6779\n7258\n6929\n6899\n2643\n7021\n4960\n1732\n4065\n2854\n3593\n\n13273\n11558\n5225\n3607\n5637\n11317\n\n65129\n\n6830\n3890\n4718\n6376\n3029\n8343\n7250\n7484\n3379\n\n16188\n11694\n16583\n18745\n\n4379\n2764\n4045\n3392\n1546\n3255\n2029\n3239\n1565\n5060\n1208\n1340\n5419\n3466\n4620\n\n5408\n11519\n10387\n7305\n5770\n1733\n5462\n\n9975\n4492\n14939\n\n6365\n5846\n1825\n2851\n5483\n4801\n4109\n2581\n4729\n5149\n5573\n3345\n5426\n2060\n\n15826\n6853\n10422\n12615\n\n26180\n\n5520\n1816\n1983\n4838\n2454\n4060\n2788\n6199\n6235\n2288\n4959\n4117\n3684\n3781\n\n33317\n13949\n\n1439\n1401\n4390\n4539\n5877\n2857\n3622\n3524\n4414\n1908\n2148\n1941\n4218\n1323\n\n9364\n14727\n3282\n\n22309\n24789\n7850\n\n3434\n19391\n9665\n\n1420\n3456\n4714\n4667\n2824\n3442\n1875\n2679\n4123\n1089\n2733\n4700\n5369\n1177\n1161\n\n1710\n4521\n2164\n5986\n2485\n5614\n6494\n5043\n6334\n4947\n1423\n3351\n4010\n4360\n\n3366\n3591\n8590\n3852\n9035\n8474\n1698\n5448\n\n4560\n2248\n7197\n1821\n5411\n4522\n4914\n7806\n1387\n5702\n1780\n\n3156\n2143\n5586\n2022\n3913\n5090\n5977\n4643\n3195\n5785\n6892\n5048\n\n3839\n1261\n10477\n8350\n5769\n12750\n\n19348\n9824\n15316\n17581\n\n7925\n7634\n\n2947\n4578\n1499\n1778\n10217\n5597\n3943\n8172\n\n2012\n3917\n8065\n5627\n7562\n5489\n4334\n1648\n6666\n8287\n\n15138\n7610\n12478\n12309\n13290\n\n6296\n1234\n7587\n5783\n3061\n5613\n3283\n4447\n7188\n4577\n4102\n\n8355\n2352\n1164\n1204\n2809\n6145\n6475\n3972\n1539\n\n1805\n1214\n4153\n1685\n2472\n4620\n2784\n1859\n1390\n3591\n2560\n6291\n2805\n\n11842\n20590\n15179\n\n22669\n16927\n13861\n\n2691\n9308\n3682\n1107\n\n6906\n5502\n2120\n6862\n8843\n5379\n9651\n8263\n7238\n\n3026\n5505\n2220\n1215\n4409\n2544\n3819\n7524\n3042\n4252\n1241\n\n11244\n2129\n8844\n10557\n4463\n2319\n\n5365\n2200\n1589\n4451\n5736\n1895\n4986\n3211\n1235\n4028\n1707\n1051\n6037\n\n14311\n5746\n\n2013\n8567\n3579\n6440\n3637\n10568\n8596\n7767\n\n5653\n7015\n5853\n3670\n4265\n3003\n4139\n3132\n7538\n3629\n\n3173\n1436\n3076\n5275\n4686\n5149\n6179\n2238\n1339\n2123\n4221\n6509\n5150\n2728\n\n35818\n\n11419\n8083\n12069\n3666\n2300\n\n28844\n10855\n\n30505\n18426\n\n3369\n3085\n7409\n7308\n6556\n9671\n5416\n5981\n7558\n\n5259\n9105\n15313\n6050\n\n3203\n3414\n11117\n6231\n6049\n11632\n4816\n\n11686\n5815\n11464\n7186\n9842\n5953\n8553\n\n9330\n1817\n3529\n1761\n1823\n3942\n9471\n2207\n\n8304\n9429\n12445\n3950\n16005\n\n4809\n3869\n6968\n3204\n3621\n5925\n3967\n5180\n5238\n3013\n5291\n1371\n\n4656\n2372\n1950\n4696\n1060\n3802\n5178\n5875\n3804\n5357\n3257\n1949\n3892\n5813\n3996\n\n10281\n24432\n9867\n\n7152\n5979\n4947\n6123\n6631\n6929\n4675\n3974\n5293\n6265\n4023\n6536\n\n2200\n2917\n4479\n3671\n7268\n3545\n6762\n5921\n1814\n3704\n2767\n4692\n\n9984\n5140\n2532\n4146\n13613\n11710\n\n2027\n2367\n7666\n8617\n7563\n6593\n5060\n4431\n2666\n5080\n\n7837\n6223\n2698\n8080\n3586\n8054\n6153\n\n4364\n5979\n13237\n9841\n8704\n\n5197\n4477\n5255\n8748\n11477\n1361\n4220\n\n12430\n4451\n1038\n9999\n7577\n\n59250\n\n3857\n2158\n7069\n4813\n1980\n1636\n3646\n6760\n2842\n4217\n7578\n\n1360\n2241\n2170\n2623\n2647\n5193\n3950\n4758\n5644\n2097\n3768\n5600\n3042\n3976\n\n3905\n7116\n9941\n1927\n2265\n4489\n\n6072\n3192\n6263\n3496\n3332\n2584\n5862\n6093\n6069\n4497\n1483\n6109\n4352\n1235\n\n18487\n10619\n16127\n11370\n\n2449\n2250\n2025\n3522\n5687\n5202\n4474\n5911\n3270\n5929\n4208\n2694\n5863\n3789\n2120\n\n2591\n9936\n3145\n4471\n2234\n2250\n1547\n3760\n\n13060\n12425\n20060\n\n1786\n6317\n2087\n1998\n4111\n2185\n5446\n2732\n3731\n6082\n4513\n6370\n2494\n3197\n\n5581\n5685\n1428\n1539\n1704\n5007\n2207\n4835\n1700\n4340\n1818\n3276\n1724\n1555\n\n16085\n18634\n\n1834\n2654\n5257\n2329\n4180\n4424\n4947\n5484\n1141\n4607\n5401\n2856\n2045\n4916\n5992\n\n2925\n4945\n4969\n1400\n6410\n1093\n2398\n1949\n2701\n2763\n6314\n1105\n1580\n2804\n\n52492\n\n4181\n8013\n15867\n\n2465\n4182\n6901\n1949\n5107\n\n3078\n5461\n5477\n5344\n5974\n9751\n\n26600\n\n3943\n9282\n9655\n4304\n11368\n\n4386\n7039\n7871\n9075\n2279\n10752\n1240\n5754\n\n6914\n7359\n6766\n5693\n7719\n5043\n8665\n7241\n3498\n8771\n\n12438\n\n2288\n2764\n2633\n3416\n3396\n3172\n2004\n3583\n1862\n3027\n3928\n3165\n\n3265\n2973\n2084\n5073\n1835\n2803\n2420\n3924\n4277\n5862\n1330\n5599\n3553\n3640\n5041\n\n8709\n1629\n\n5938\n9575\n1789\n6720\n\n3623\n4874\n8500\n6566\n6965\n9388\n2106\n8552\n\n9147\n4821\n5991\n9194\n3138\n2877\n5089\n4677\n3841\n\n2865\n4858\n4642\n3755\n5958\n8076\n5599\n7931\n\n5112\n2846\n2713\n3603\n5395\n4539\n4324\n2518\n1850\n5995\n\n44743\n\n1052\n3226\n3355\n4357\n4745\n4324\n4606\n3155\n3877\n1188\n4762\n1587\n2101\n1792\n4723\n\n2071\n4440\n7135\n5825\n6083\n4034\n4572\n6942\n\n3345\n5000\n1167\n1951\n4713\n2062\n4786\n7635\n1304\n6163\n5063\n\n7060\n1738\n2658\n1217\n1388\n7416\n3719\n3903\n2305\n1051\n4437\n2496\n\n9603\n\n17966\n16434\n6253\n\n8045\n8593\n9128\n6057\n10943\n11143\n2626\n\n1961\n2742\n5305\n4780\n4307\n2465\n4472\n2946\n1404\n2195\n4822\n5607\n1027\n5697\n\n26688\n\n1004\n1382\n1194\n4638\n3773\n5037\n3731\n2676\n3567\n1159\n1136\n2883"
  val sum = cal.split("\n\n").map(_.split("\n").map(_.toInt).sum).sorted.takeRight(3).sum
  println(sum)
}
