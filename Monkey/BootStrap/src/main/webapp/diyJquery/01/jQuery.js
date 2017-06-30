/**
 * Created by Think on 2017/6/28.
 */
;(function () {
    var _jQuery = window.jQuery,
        _$=window.$;

    var version = "0.0.1",
        jQuery = function (selector,context) {
            return new jQuery.fn.init(selector,context);
        };

        jQuery.fn=jQuery.prototype={
            jquery:version,
            constructor:jQuery,
            setBackground:function () {
                this[0].style.background = "yellow";
                return this;
            },
            setColor:function () {
                this[0].style.color = "blue";
                return this;
            }
        };

        jQuery.extend=jQuery.fn.extend=function(){
            console.log(this);
        };

        var init=jQuery.fn.init=function (selector,context,root) {
            if(!selector){
                return this;
            }else{
                var elem=document.querySelector(selector);
                if(elem){
                    this[0]=elem;
                    this.length=1;
                }
                return this;
            }
        };

        init.prototype=jQuery.fn;

        jQuery.noConflict=function(deep){
            if(window.$===jQuery){
                window.$=_$;
            }

            if(deep && window.jQuery === jQuery){
                window.jQuery=_jQuery;
            }

            return jQuery;
        };

        window.jQuery=window.$=jQuery;
})();