Date.prototype.format = function (fmt) {
	            var o = {
			                    'M+':this.getMonth() + 1, //月份
			                    'd+':this.getDate(), //日
			                    'h+':this.getHours(), //小时
			                    'm+':this.getMinutes(), //分
			                    's+':this.getSeconds(), //秒
			                    'q+': Math.floor((this.getMonth() + 3) / 3), //季度
			                    S:this.getMilliseconds(), //毫秒
			                };
	            if (/(y+)/.test(fmt)) {
			                    fmt = fmt.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
			                }
		            for (var k in o) {
				                    if (new RegExp('(' + k + ')').test(fmt)) {
							                        fmt = fmt.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ('00' + o[k]).substr(('' + o[k]).length));
							                    }
					                }
		            return fmt;
	        };

let now = new Date();
console.log(now);
console.log(now.format("yyyy-MM"));

let d = new Date(2020, 03);
console.log(d);

let d2 = new Date('2020-03');
console.log(d2);

let d3 = new Date('2020', '03');
console.log(d3);

let strDate = '2020-03';
let tuple = strDate.split('-');
console.log(tuple);


let d4 = new Date(tuple[0], tuple[1]);
console.log(d4);

let d5 = new Date(parseInt(tuple[0]), parseInt(tuple[1]), 1);

console.log(d5);


console.log("---------------------");
let d6 = new Date(2020, 1, 1);
console.log(d6);
console.log(d6.getDate());

let d7 = new Date(2020, -1, 1);
console.log(d7);
