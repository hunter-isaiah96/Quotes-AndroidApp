package com.example.djrhy.quotes;

import java.util.List;

/**
 * Created by djrhy on 8/11/2016.
 */
public class Response {

    /**
     * success : true
     * quotes : [{"_id":"57acfab53264a13c40cdc0bb","quoter_image":{"public_id":"ajxs9vvnnfqvhguzk84p","version":1470954170,"signature":"5659cf4d7d00e1437914e391eeae3209cc123d9f","width":1000,"height":1000,"format":"png","resource_type":"image","created_at":"2016-08-11T22:22:50Z","tags":[],"bytes":1142369,"type":"upload","etag":"dcf4769013e8872f149f4d1aec2c2e4f","url":"http://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png","secure_url":"https://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png"},"quote":"ASDASD","quoter":"ASDASD","__v":0,"created_at":"2016-08-11T22:22:45.338Z"},{"_id":"57acfb6271f42f4c5dfeed51","quoter_image":{"public_id":"cb1rcyiymvrx6blrxr5g","version":1470954344,"signature":"30a2950e643681ef9b269152ac71bff48f349c54","width":845,"height":900,"format":"jpg","resource_type":"image","created_at":"2016-08-11T22:25:44Z","tags":[],"bytes":88003,"type":"upload","etag":"0adf00b6463bceb4011352c467fe499e","url":"http://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954344/cb1rcyiymvrx6blrxr5g.jpg","secure_url":"https://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954344/cb1rcyiymvrx6blrxr5g.jpg"},"quote":"Always be yourself, express yourself, have faith in yourself, do not go out and look for a successful personality and duplicate it.","quoter":"Bruce Lee","__v":0,"created_at":"2016-08-11T22:25:38.770Z"}]
     */

    private boolean success;
    /**
     * _id : 57acfab53264a13c40cdc0bb
     * quoter_image : {"public_id":"ajxs9vvnnfqvhguzk84p","version":1470954170,"signature":"5659cf4d7d00e1437914e391eeae3209cc123d9f","width":1000,"height":1000,"format":"png","resource_type":"image","created_at":"2016-08-11T22:22:50Z","tags":[],"bytes":1142369,"type":"upload","etag":"dcf4769013e8872f149f4d1aec2c2e4f","url":"http://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png","secure_url":"https://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png"}
     * quote : ASDASD
     * quoter : ASDASD
     * __v : 0
     * created_at : 2016-08-11T22:22:45.338Z
     */

    private List<QuotesBean> quotes;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<QuotesBean> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<QuotesBean> quotes) {
        this.quotes = quotes;
    }

    public static class QuotesBean {
        private String _id;
        /**
         * public_id : ajxs9vvnnfqvhguzk84p
         * version : 1470954170
         * signature : 5659cf4d7d00e1437914e391eeae3209cc123d9f
         * width : 1000
         * height : 1000
         * format : png
         * resource_type : image
         * created_at : 2016-08-11T22:22:50Z
         * tags : []
         * bytes : 1142369
         * type : upload
         * etag : dcf4769013e8872f149f4d1aec2c2e4f
         * url : http://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png
         * secure_url : https://res.cloudinary.com/dpvrcbjm0/image/upload/v1470954170/ajxs9vvnnfqvhguzk84p.png
         */

        private QuoterImageBean quoter_image;
        private String quote;
        private String quoter;
        private int __v;
        private String created_at;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public QuoterImageBean getQuoter_image() {
            return quoter_image;
        }

        public void setQuoter_image(QuoterImageBean quoter_image) {
            this.quoter_image = quoter_image;
        }

        public String getQuote() {
            return quote;
        }

        public void setQuote(String quote) {
            this.quote = quote;
        }

        public String getQuoter() {
            return quoter;
        }

        public void setQuoter(String quoter) {
            this.quoter = quoter;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public static class QuoterImageBean {
            private String public_id;
            private int version;
            private String signature;
            private int width;
            private int height;
            private String format;
            private String resource_type;
            private String created_at;
            private int bytes;
            private String type;
            private String etag;
            private String url;
            private String secure_url;
            private List<?> tags;

            public String getPublic_id() {
                return public_id;
            }

            public void setPublic_id(String public_id) {
                this.public_id = public_id;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public String getResource_type() {
                return resource_type;
            }

            public void setResource_type(String resource_type) {
                this.resource_type = resource_type;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public int getBytes() {
                return bytes;
            }

            public void setBytes(int bytes) {
                this.bytes = bytes;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getEtag() {
                return etag;
            }

            public void setEtag(String etag) {
                this.etag = etag;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getSecure_url() {
                return secure_url;
            }

            public void setSecure_url(String secure_url) {
                this.secure_url = secure_url;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
