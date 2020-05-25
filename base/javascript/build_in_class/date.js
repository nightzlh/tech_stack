let curDate = new Date();
let curYear = curDate.getFullYear()
let curMonth = curDate.getMonth();
let months = [];
console.log(curYear)
for(let i = 1; i < curMonth + 1; ++i) {    
	let dash = i < 10 ? '-0' : '-';
        console.log(curYear + dash);
	months.push(curYear + dash + curMonth);
}
console.log(months);

console.log(curDate.getTime());
