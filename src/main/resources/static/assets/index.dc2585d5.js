const n={mounted(e,t){if(typeof t.value!="function")throw"callback must be a function";e.__handleClick__=function(c){e.contains(c.target)?t.value(!1):t.value(!0)},document.addEventListener("click",e.__handleClick__)},beforeUnmount(e){document.removeEventListener("click",e.__handleClick__)}};export{n as default};