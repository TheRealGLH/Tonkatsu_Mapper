/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.enums;

/**
 *
 * @author Martijn
 */

/*
Format
 */
public enum TileType {
    base {
        @Override
        public int getXCoord() {
            return 3;
        }

        @Override
        public int getYCoord() {
            return 2;
        }
    },
    left {
        @Override
        public int getXCoord() {
            return 0;
        }

        @Override
        public int getYCoord() {
            return 2;
        }
    },
    right {
        @Override
        public int getXCoord() {
            return 1;
        }

        @Override
        public int getYCoord() {
            return 2;
        }
    },
    top {
        @Override
        public int getXCoord() {
            return 0;
        }

        @Override
        public int getYCoord() {
            return 3;
        }
    },
    bottom {
        @Override
        public int getXCoord() {
            return 1;
        }

        @Override
        public int getYCoord() {
            return 3;
        }
    };

    public abstract int getXCoord();

    public abstract int getYCoord();
}
